public class BobThePainter {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.26,0.75));

    }

    public static int getBucketCount(double width,double height,double areaPerBucket, double extraBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0){
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((width * height)/areaPerBucket);
        int finalBucket = (int) (bucketsNeeded - extraBucket);
        return finalBucket;
    }

    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((width * height)/areaPerBucket);
        return bucketsNeeded;
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((area/areaPerBucket));
        return bucketsNeeded;
    }
}
