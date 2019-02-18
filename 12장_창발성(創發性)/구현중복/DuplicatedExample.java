package 구현중복;

public class DuplicatedExample {

	private static final float ERROR_THRESHOLD = 10;

	private RenderedOp image;

	public void scaleToOneDimension(float desiredDimension, float imageDimension) {
		if (Math.abs(desiredDimension - imageDimension) < ERROR_THRESHOLD)
			return;

		float scalingFactor = desiredDimension / imageDimension;
		scalingFactor = (float) (Math.floor(scalingFactor * 100) * 0.01f);

		RenderedOp newImage = ImageUtilities.getScaledImage(image, scalingFactor, scalingFactor);
		////
		image.dispose();
		System.gc();
		image = newImage;
		////
	}

	public synchronized void rotate(int degrees) {
		RenderedOp newImage = ImageUtilities.getRotatedImage(image, degrees);
		////
		image.dispose();
		System.gc();
		image = newImage;
		////
	}
}
