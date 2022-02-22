import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class GuiController {
    public Label label2;
    public Polyline poly;

    public void buttonPressed(MouseEvent mouseEvent) {
        label2.setText("Du trykkede på knappen!");
        poly.getPoints().addAll((Math.random()-0.5)*100,(Math.random()-0.5)*100);

    }
}
