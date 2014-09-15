package com.shushanfx.commons.imaging;

import java.awt.Dimension;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;

public class SimpleUsage {

    public SimpleUsage() {

        try {
            // <b>Code won't work unless these variables are properly
            // initialized.
            // Imaging works equally well with File, byte array or InputStream
            // inputs.</b>
            final BufferedImage someImage = null;
            final byte someBytes[] = null;
            final File someFile = null;
            final InputStream someInputStream = null;
            final OutputStream someOutputStream = null;

            // <b>The Imaging class provides a simple interface to the library.
            // </b>

            // <b>how to read an image: </b>
            final byte imageBytes[] = someBytes;
            final BufferedImage image_1 = Imaging.getBufferedImage(imageBytes);

            // <b>methods of Imaging usually accept files, byte arrays, or
            // inputstreams as arguments. </b>
            final BufferedImage image_2 = Imaging.getBufferedImage(imageBytes);
            final File file = someFile;
            final BufferedImage image_3 = Imaging.getBufferedImage(file);
            final InputStream is = someInputStream;
            final BufferedImage image_4 = Imaging.getBufferedImage(is);

            // <b>Write an image. </b>
            final BufferedImage image = someImage;
            final File dst = someFile;
            final ImageFormat format = ImageFormats.PNG;
            final Map<String, Object> optionalParams = new HashMap<String, Object>();
            Imaging.writeImage(image, dst, format, optionalParams);

            final OutputStream os = someOutputStream;
            Imaging.writeImage(image, os, format, optionalParams);

            // <b>get the image's embedded ICC Profile, if it has one. </b>
            final byte iccProfileBytes[] = Imaging.getICCProfileBytes(imageBytes);

            final ICC_Profile iccProfile = Imaging.getICCProfile(imageBytes);

            // <b>get the image's width and height. </b>
            final Dimension d = Imaging.getImageSize(imageBytes);

            // <b>get all of the image's info (ie. bits per pixel, size,
            // transparency, etc.) </b>
            final ImageInfo imageInfo = Imaging.getImageInfo(imageBytes);

            if (imageInfo.getColorType() == ImageInfo.COLOR_TYPE_GRAYSCALE) {
                System.out.println("Grayscale image.");
            }
            if (imageInfo.getHeight() > 1000) {
                System.out.println("Large image.");
            }

            // <b>try to guess the image's format. </b>
            final ImageFormat imageFormat = Imaging.guessFormat(imageBytes);
            imageFormat.equals(ImageFormats.PNG);

            // <b>get all metadata stored in EXIF format (ie. from JPEG or
            // TIFF). </b>
            final IImageMetadata metadata = Imaging.getMetadata(imageBytes);

            // <b>print a dump of information about an image to stdout. </b>
            Imaging.dumpImageFile(imageBytes);

            // <b>get a summary of format errors. </b>
            final FormatCompliance formatCompliance = Imaging
                    .getFormatCompliance(imageBytes);

        } catch (final Exception e) {

        }
    }

    public static void main(String[] args) {
        SimpleUsage simpleUsage = new SimpleUsage();
    }
}
