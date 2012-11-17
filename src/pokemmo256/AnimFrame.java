/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemmo256;

import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author James
 */
public class AnimFrame extends JInternalFrame {

    public AnimFrame(){
        super();
        
    }
    
    private final void drawImage(BufferedImage paramBufferedImage) {
        int i = paramBufferedImage.getWidth();
        int j = paramBufferedImage.getHeight();
        int k = 1;
        int m = 1;
        /*
         if (this.S == 0) {
         k = this.F;
         m = this.J;
         }
         if (this.S == 1) {
         k = i / this.C;
         m = j / this.B;
         }
         * */
        //this.I = k;
        //this.Z = m;
        int n = i / k;
        int i1 = j / m;
        //this.A = (n * i1);
        //drawString = new BufferedImage[this.A];
        int i2 = 0;
        for (int i3 = 0; i3 < i1; i3++) {
            for (int i4 = 0; i4 < n; i4++) {
                //drawString[i2] = paramBufferedImage.getSubimage(i4 * k, i3 * m, i4 * k + k - i4 * k, i3 * m + m - i3 * m);
                i2++;
            }
        }
    }

    /**
     * This is going to be the timer for the animation so that it doesn't block the GUI thread
     */
    public final void run() {
        Thread localThread = Thread.currentThread();
        /*
        while (this.G == localThread) {
            repaint();
            this.E += 1;
            if (this.E >= this.A) {
                this.E = 0;
            }
            try {
                Thread.sleep(this.D);
            } catch (Exception localException) {
            }
        }
        */
    }
    private class AnimPanel extends JPanel {
        
    }
}