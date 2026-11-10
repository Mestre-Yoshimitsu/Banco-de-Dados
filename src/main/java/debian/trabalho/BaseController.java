package debian.trabalho;

import javafx.animation.FadeTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;
import javafx.scene.paint.Color;

public class BaseController {

    public void popUp(Label label, String mensagem, boolean bom) {
        label.setText(mensagem);
        label.setOpacity(1.0);
        if (bom) {
            label.setTextFill(Color.GREEN);
        } else {
            label.setTextFill(Color.RED);
        }
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(1.5), label);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setDelay(Duration.seconds(2.0));

        fadeOut.setOnFinished(e -> label.setText(""));

        fadeOut.play();
    }

}
