Feature: Add Videos to the library

Scenario: Add a video to the library that is not already added
Given the video is not in the library
When the video is added to the library
Then the video was added to the library