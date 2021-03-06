package de.embl.cba.fish;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.PlugIn;

import java.util.ArrayList;

import static de.embl.cba.fish.ChannelConfigDialog.*;

/**
 * Created by tischi on 24/03/17.
 */
public class AnalyzeFISHSpotsPlugIn implements PlugIn {

    ImagePlus imp;
    AnalyzeFISHSpotsUI analyzeFISHSpotsUI;

    public AnalyzeFISHSpotsPlugIn()
    {
    }

    public AnalyzeFISHSpotsPlugIn( String path) {
        IJ.open(path);
        this.imp = IJ.getImage();
    }

    public void run(String arg) {
        if ( imp == null )
            this.imp = IJ.getImage();

        final ArrayList< ChannelType > channelTypes = new ChannelConfigDialog( imp ).showDialogToGetChannelTypes();
        final ArrayList< Double > channelBackgrounds = new BackgroundMeasurementDialog( imp ).showDialogToGetBackgroundMeasurements();
        new AnalyzeFISHSpotsUI( imp, channelTypes, channelBackgrounds ).showDialog();
    }
}
