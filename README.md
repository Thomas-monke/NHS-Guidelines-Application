# NHS Guidelines Application

This unofficial application is designed for NHS Doctors and Clinicians to view guidelines for specific conditions. These guidelines are stored in a database and are created by System Authors who use the built in features of the app to create consistently styled guidelines. These are then checked and approved by External Auditors, who can make changes to the guidelines.

---
## Application GUI

**Here are some wireframes for what we think the finished product should look like:**

| Wireframe | Description |
| ----------- | ----------- |
| ![Home page first step on a mobile device](Images/MobileHomepage.png "Home page first step on a mobile device") | Figure 1: Guidelines homepage on a mobile phone. This is the first page that the user will see if they successfully login to the app. A carousel method is used to navigate between different categories of guidelines. |
| ![Home page user settings on a mobile device](Images/MobileHomepage2.png "Home page user settings on a mobile device") | Figure 2:  User settings on the guidelines homepage. The user can either logout and return to the login page or they can access the settings page of the app where they can change the appearance of the app to improve accessibility. |
| ![Home page hamburger menu on a mobile device](Images/MobileHomepage3.png "Home page hamburger menu on a mobile device") | Figure 3: The guidelines homepage with an extended hamburger menu. The menu shows the different categories of guidelines that the user can visit while providing options to logout of the app, view the settings and search for specific guidelines. |

![General wireframes](Images/Wireframe.png "General wireframes")
Figure 4: Three wireframes - one for the home menu, another for the sidebar menu and the last for the dropdown of a specific guideline.

---
## Download
**Type in terminal:**

`git clone https://github.com/Thomas-monke/NHS-Guidelines-Application/`

Then in android studio, go to File, then Open... and navigate to the directory that the git clone command was run and open it.

To download android studio: https://developer.android.com/studio
---
#Implemented UI features
Added toolbar - access it from the home page of the application
Added sidebar - access it using the toolbar icon on the left, or by dragging from the left hand side of the screen to the right. This will display a side menu where different activities can be accessed. The five activities are: Home, Guidelines, Help, Settings and Logout.
Added Carousel in the guidelines activity. Different categories of conditions can be swiped through. For now, simple UI images are being used to represent conditions but this is not intended to be final. When the user swipes to a new category, the TextView updates accordingly. A future implementation will have a ListView which will store all conditions and their associated guidelines. These can be searched through using the SearchView component, which currently has no functionality. 
