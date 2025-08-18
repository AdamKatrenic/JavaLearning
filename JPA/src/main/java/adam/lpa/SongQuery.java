package adam.lpa;

import adam.lpa.music.Album;
import adam.lpa.music.Artist;
import adam.lpa.music.Song;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.*;

import java.util.List;
import java.util.Objects;

public class SongQuery {

    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("adam.lpa.music"); EntityManager em = emf.createEntityManager()) {

            String dashedString = "-" . repeat(19);
            String word = "Soul";
            var matches = getMatchedSongs(em, "%" + word + "%");
            System.out.printf("%-30s %-65s %s%n", "Artist", "Album", "Song Title");
            System.out.printf("%1$-30s %-65s %1$s%n", dashedString);

            matches.forEach(a -> {
                String artistName = a.getArtistName();
                a.getAlbums().forEach(b -> {
                    String albumName = b.getAlbumName();
                    b.getPlaylist().forEach(s -> {
                        String songTitle = s.getSongTitle();
                        if (songTitle.contains(word)) {
                            System.out.printf("%-30s %-65s %s%n", artistName, albumName, songTitle );
                        }
                    });
                });
            });
            System.out.printf("%-30s %-65s %s%n", "Artist", "Album", "Song Title");
            System.out.printf("%1$-30s %-65s %1$s%n", dashedString);
            var bmatches = getMatchedSongsBuilder(em, "%" + word + "%");
            bmatches.forEach(m -> {
                System.out.printf("%-30s %-65s %s%n", (String) m[0], (String) m[1], (String) m[2]);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Artist> getMatchedSongs(EntityManager em, String matchedValue) {

        String jpql = "SELECT a FROM Artist a JOIN albums album join playlist p" +
                " WHERE p.songTitle LIKE ?1";
        var query = em.createQuery(jpql, Artist.class);
        query.setParameter(1, matchedValue);
        return query.getResultList();
    }

    private static List<Object[]> getMatchedSongsBuilder(EntityManager em, String matchedValue) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<Artist> root = cq.from(Artist.class);
        Join<Artist, Album> albumJoin = root.join("albums", JoinType.INNER);
        Join<Album, Song> songJoin = albumJoin.join("playList", JoinType.INNER);

        cq
                .multiselect(
                        root.get("artistName"),
                        albumJoin.get("albumName"),
                        songJoin.get("songTitle")
                )
                .where(cb.like(songJoin.get("songTitle"),matchedValue))
                .orderBy(cb.asc(root.get("artistName")));

        return em.createQuery(cq).getResultList();
    }
}
