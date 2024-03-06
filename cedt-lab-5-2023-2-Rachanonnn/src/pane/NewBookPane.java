package pane;

import item.Book;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import utils.Goto ;

import java.util.ArrayList;

public class NewBookPane extends GridPane {
    public NewBookPane() {
        setPadding(new Insets(12));
        setVgap(8);

        TextField name = input();
        TextField author = input();
        TextField rating = input();
        TextField image = input();
        TextField description = input();

        ColumnConstraints columnConstraints1 = new ColumnConstraints();
        columnConstraints1.setPercentWidth(25);
        columnConstraints1.setHalignment(HPos.RIGHT);
        ColumnConstraints columnConstraints2 = new ColumnConstraints();
        columnConstraints2.setPercentWidth(75);

        Button btn = new Button("Add");
        btn.setMaxWidth(430);
        btn.setPrefHeight(32);
        btn.setTextFill(Color.WHITE);
        btn.setBackground(Background.fill(Color.DARKCYAN));
        btn.setOnMouseClicked(e -> {
            handleClick(name.getText(), author.getText(), rating.getText(), image.getText(), description.getText());
        });

        this.getColumnConstraints().addAll(columnConstraints1, columnConstraints2);
        this.add(label("Title: "), 0, 0);
        this.add(label("Author: "), 0, 1);
        this.add(label("Rating: "), 0, 2);
        this.add(label("Image: "), 0, 3);
        this.add(label("Description: "), 0, 4);

        this.add(name, 1, 0);
        this.add(author, 1, 1);
        this.add(rating, 1, 2);
        this.add(image, 1, 3);
        this.add(description, 1, 4);

        this.add(btn, 0, 5, 2, 1);
    }

        private Text label (String s){
            Text newtext = new Text(s);
            newtext.setFont(Font.font(16));
            return newtext;
        }
        private TextField input () {
            TextField textField = new TextField();
            textField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(16), null)));
            textField.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, new CornerRadii(16), null)));
            return textField;
        }
        private void handleClick (String name, String author, String rating, String image, String description){
            if (name.isBlank() || author.isBlank() || rating.isBlank() || image.isBlank() || description.isBlank()) {
                return;
            }
            Book newBook = new Book(name, author, rating, image, description);
            ArrayList<Book> bookList = BookListPane.getInstance().getBooks();
            bookList.add(newBook);
            BookListPane.getInstance().setSearchBooks(bookList);
            Goto.mainPage();
        }
}