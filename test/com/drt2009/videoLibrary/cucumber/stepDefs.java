package com.drt2009.videoLibrary.cucumber;

import com.drt2009.videoLibrary.api.VideoLibrary;
import com.drt2009.videoLibrary.impl.VideoLibraryImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDefs {

    VideoLibrary library = new VideoLibraryImpl();

    //Given

    //When
    @When("{string} is added to the library")
    public void isAddedToTheLibrary(String videoName) {
        library.addVideoTitleToLibrary(videoName);
    }

}
