package lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class ImageBlur {
    public static void main(String[] args) throws IOException {
        BufferedImage sourceImage = ImageIO.read(new File("image.jpg"));
        WritableRaster sourceRaster = sourceImage.getRaster();

        BufferedImage outputImage = new BufferedImage(sourceImage.getColorModel(), sourceRaster,
                sourceImage.getColorModel().isAlphaPremultiplied(), null);
        WritableRaster outputRaster = outputImage.getRaster();

        int convolutionMatrixSize = 3;
        double[][] convolutionMatrix = new double[convolutionMatrixSize][convolutionMatrixSize];

        double convolutionMatrixCoefficient = 1.0 / (convolutionMatrixSize * convolutionMatrixSize);

        for (int i = 0; i < convolutionMatrix.length; i++) {
            for (int j = 0; j < convolutionMatrix[i].length; j++) {
                convolutionMatrix[i][j] = convolutionMatrixCoefficient;
            }
        }

        int processingRadius = convolutionMatrixSize / 2;

        int xRightBorder = sourceRaster.getWidth() - processingRadius;
        int yBottomBorder = sourceRaster.getHeight() - processingRadius;

        final int COLORS_COUNT_IN_RGB = 3;

        int[] sourcePixel = new int[COLORS_COUNT_IN_RGB];
        double[] outputPixel = new double[COLORS_COUNT_IN_RGB];

        for (int y = processingRadius; y < yBottomBorder; y++) {
            for (int x = processingRadius; x < xRightBorder; x++) {
                for (int i = 0, k = y - processingRadius; i < convolutionMatrixSize; i++, k++) {
                    for (int j = 0, m = x - processingRadius; j < convolutionMatrixSize; j++, m++) {
                        sourceRaster.getPixel(m, k, sourcePixel);

                        for (int n = 0; n < COLORS_COUNT_IN_RGB; n++) {
                            outputPixel[n] += sourcePixel[n] * convolutionMatrix[i][j];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    outputPixel[i] = getColorInAllowableRange(outputPixel[i]);
                }

                outputRaster.setPixel(x, y, outputPixel);

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    outputPixel[i] = 0;
                }
            }
        }

        ImageIO.write(outputImage, "png", new File("image_blur.png"));
    }

    public static int getColorInAllowableRange(double color) {
        if (color < 0) {
            return 0;
        }

        if (color > 255) {
            return 255;
        }

        return (int) Math.round(color);
    }
}