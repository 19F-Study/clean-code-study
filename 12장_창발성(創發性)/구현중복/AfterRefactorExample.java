package 구현중복;

public class AfterRefactorExample {

	private static final float ERROR_THRESHOLD = 10;

	private RenderedOp image;

	public void scaleToOneDimension(float desiredDimension, float imageDimension) {
		if (Math.abs(desiredDimension - imageDimension) < ERROR_THRESHOLD)
			return;
		float scalingFactor = desiredDimension / imageDimension;
		scalingFactor = (float)(Math.floor(scalingFactor * 100) * 0.01f);
		replaceImage(ImageUtilities.getScaledImage(image, scalingFactor, scalingFactor));
	}

	public synchronized void rotate(int degrees) {
		replaceImage(ImageUtilities.getRotatedImage(image, degrees));
	}

	private void replaceImage(RenderedOp newImage) {
		image.dispose();
		System.gc();
		image = newImage;
	}
}
