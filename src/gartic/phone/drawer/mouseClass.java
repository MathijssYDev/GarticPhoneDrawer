
package gartic.phone.drawer;
import java.awt.AWTException;
import java.awt.Robot;

public class mouseClass {
    Robot m;
    UIClass ui;
    public mouseClass() {
        try {
            this.m = new Robot();
            m.mouseMove(1, 1);
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
        this.ui = new UIClass();
        ui.updateBar(10);
        ui.show();
    }
}
