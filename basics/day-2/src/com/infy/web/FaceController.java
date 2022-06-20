package com.infy.web;

import com.infy.db.Face;

public class FaceController {

	public static void main(String[] args) {
		Face face=new Face();
		face.saveFacePixelToDb();
		
		//atleast one should be fully qualified
		
		com.infy.ui.Face face2=new com.infy.ui.Face();
		face2.drawFacePixcel();
	}
}
