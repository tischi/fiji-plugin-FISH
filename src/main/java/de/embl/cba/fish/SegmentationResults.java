package de.embl.cba.fish;

import fiji.plugin.trackmate.Model;
import fiji.plugin.trackmate.SpotCollection;

/**
 * Created by tischi on 25/03/17.
 */
public class SegmentationResults
{
    public String segmentationMethod;
    public Model[] models; // the array is channel-wise
    public SpotCollection[] spotCollections; // the array is channel-wise
    public SpotsTable SpotsTable;
}
