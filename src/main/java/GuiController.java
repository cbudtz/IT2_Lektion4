import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class GuiController {
    public Label label2;

    public void buttonPressed(MouseEvent mouseEvent) {
        label2.setText("Du trykkede på knappen!");
    }
}
