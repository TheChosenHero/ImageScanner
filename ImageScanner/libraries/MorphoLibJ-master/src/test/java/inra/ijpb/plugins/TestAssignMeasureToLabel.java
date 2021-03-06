package inra.ijpb.plugins;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.frame.Recorder;

public class TestAssignMeasureToLabel {
	/**
	 * Main method to test and debug the Assign Measure To Label plugin
	 *
	 * @param args
	 */
	public static void main( final String[] args )
	{
		ImageJ.main( args );
		Recorder r = new Recorder(true);
		IJ.open( TestMorphologicalSegmentation.class.getResource( "/files/blobs-lbl32.tif" ).getFile() );
		RegionMorphometryPlugin rmp = new RegionMorphometryPlugin();
		rmp.setup(null, IJ.getImage() );
		rmp.run( null );
		new LabelToValuePlugin().run( null );
	}
}
