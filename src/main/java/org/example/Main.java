package org.example;

import nu.pattern.OpenCV;
import org.opencv.core.Core;
import org.opencv.imgcodecs.Imgcodecs;

public class Main {
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OpenCV.loadLocally();
        Imgcodecs imgcodecs = new Imgcodecs();
        var img = imgcodecs.imread("test.jpg");
        imgcodecs.imwrite("test2.jpg",img);

    }
}