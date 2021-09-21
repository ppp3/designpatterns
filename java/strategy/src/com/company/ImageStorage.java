package com.company;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }


    public void store(String fileName)
    {
        if (compressor=="jpeg")
        {
            System.out.println("JPEG compression");
        }
        else if(compressor=="png")
        {
            System.out.println("PNG compression");
        }

        if (filter=="b&w")
        {
            System.out.println("B&W filter");
        }
        else if(filter=="high-contrast")
        {
            System.out.println("Applying high contrast filter");
        }

    }
}
