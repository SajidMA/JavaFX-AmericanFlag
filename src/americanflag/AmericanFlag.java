// Sajid Ahmed
// Final Lab - JavaFX
// Use JavaFX Application to draw the American Flag (without the stars).

package americanflag;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;
public class AmericanFlag extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        Color RED = Color.rgb(187, 19, 62); //official red for US flag
        Color BLUE = Color.rgb(0, 38, 100); //official blue for US flag
        Pane root = new Pane();
        for (int count = 0; count < 299; count = count + 23) //loops through to create rectangles as the stripes
        {
           // creates the red rectangles and sets color to red
           Rectangle redstripes = new Rectangle(0, count, 500, 23);
           redstripes.setFill(RED);
           // creates the white stripes and sets color to white
           Rectangle whitestripes = new Rectangle(0, count + 23, 500, 23);
           whitestripes.setFill(Color.WHITE);
           // groups the two colored stripes together and adds it to root
           Group flag = new Group(redstripes, whitestripes);
           root.getChildren().add(flag);
           // increases the y value of the rectangles
           count = count + 23;
        }
        // creates the blue rectangle in the corner and sets color to blue
        Rectangle box = new Rectangle(0, 0, 250, 161);
        box.setFill(BLUE);
        // groups the box and adds it to root
        Group flag1 = new Group(box);
        root.getChildren().add(flag1);
        // puts everything togteher and makes the dimensions of the scene
        Scene scene = new Scene(root, 500, 299);
        // sets the title of the window
        primaryStage.setTitle("USA Flag");
        // makes the scene visible
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}