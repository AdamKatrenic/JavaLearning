module org.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.todolist to javafx.fxml;
    exports org.example.todolist;
}