# Hand-Gesture-Recognition
Recognition of hand gestures by prediction appropriate position of points
on the hand and finally based on the gesture the furhat bot responds.

• Design
An Object Detection API to train a Fast Region Convolution Neural Network
is used. The reason we chose Fast R-CNN is that it can classify
multiple objects with low latency. The input features to the network are
raw frames from the videos and output is a CSV file containing the desired
class (Hand Gesture) and position of the hand in the frame. The Faster
R-CNN has three components:
– Convolution Layers: To extract features from images.
– Region Proposal Network: To check whether the desired object is
present or not. If the object is present then a bounding box for those
object are given out.
– Classes Detection: Here the bounded region part of the images are
classified. It simply flattens the bounding region of the image and
passes it through several dense layers and then a final Softmax layer
which returns probabilities for each class.

• Implementation
From video data set provided, frames at interval of 50 were extracted
from all the video and this data was split in test and train in the ratio of
20:80 which resulted in having 164 frames for train and 34 for test. These
frames are input features and out for network was generated manual for
almost 200 frames using tool called Labellmg which generates xml file
containing label and bounding for each but the issue is that we cannot

• Results
It took around 11 hours and 5400 steps later to reduce the error to a
respectable quantity of 0.07 as the API did not support my GPU.
