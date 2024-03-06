package pane;

import item.Book;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class SearchPane extends HBox {
    public SearchPane() {
        setAlignment(Pos.CENTER);
        TextField textField = new TextField();
        textField.setPromptText("Find the book");
        textField.setPrefWidth(250);

        Button btn = new Button("Search");
        btn.setBackground(Background.fill(Color.DARKCYAN));
        btn.setTextFill(Color.WHITE);
        btn.setOnAction(e -> {
            ArrayList<Book> filter = new ArrayList<>(BookListPane.getInstance().getBooks());
            if(textField.getText().trim().isEmpty()) {
                BookListPane.getInstance().setSearchBooks(filter);
            } else {
                filter.removeIf(book -> !book.getName().toLowerCase().contains(textField.getText().trim().toLowerCase())) ;
                BookListPane.getInstance().setSearchBooks(filter);
            }
        });
        getChildren().addAll(textField, btn);
    }

}
