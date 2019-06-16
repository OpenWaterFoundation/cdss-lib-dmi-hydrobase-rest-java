// ColoradoHydroBaseRest_WaterClass_TableModel - table model for water class

/* NoticeStart

CDSS HydroBase REST Web Services Java Library
CDSS HydroBase REST Web Services Java Library is a part of Colorado's Decision Support Systems (CDSS)
Copyright (C) 2018-2019 Colorado Department of Natural Resources

CDSS HydroBase REST Web Services Java Library is free software:  you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    CDSS HydroBase REST Web Services Java Library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CDSS HydroBase REST Web Services Java Library.  If not, see <https://www.gnu.org/licenses/>.

NoticeEnd */

package cdss.dmi.hydrobase.rest.ui;

import java.text.DecimalFormat;
import java.util.List;

import RTi.TS.TSIdent;
import RTi.TS.TimeSeriesIdentifierProvider;
import RTi.Util.GUI.JWorksheet;
import RTi.Util.GUI.JWorksheet_AbstractRowTableModel;
import cdss.dmi.hydrobase.rest.ColoradoHydroBaseRestDataStore;
import cdss.dmi.hydrobase.rest.dao.DiversionWaterClass;
import cdss.dmi.hydrobase.rest.dao.ReferenceTablesCurrentInUseCodes;


// FIXME @jurentie why is this complaining? 06/22/2018
/**
This class is a table model for time series header information for HydroBase waterclass time series.
By default the sheet will contain row and column numbers.
*/
@SuppressWarnings("serial")
public class ColoradoHydroBaseRest_WaterClass_TableModel
extends JWorksheet_AbstractRowTableModel<DiversionWaterClass> implements TimeSeriesIdentifierProvider
{

/**
Number of columns in the table model, including the row number.
*/
private final int __COLUMNS = 23;

public final int COL_ID = 0;
public final int COL_NAME = 1;
public final int COL_DATA_SOURCE = 2;
public final int COL_DATA_TYPE = 3;
public final int COL_TIME_STEP = 4;
public final int COL_UNITS = 5;
public final int COL_STR_TYPE = 6;
public final int COL_CIU = 7;
public final int COL_START = 8;
public final int COL_END = 9;
// public final int COL_MEAS_COUNT = 8;  // Not in object
public final int COL_DIV = 10;
public final int COL_DIST = 11;
public final int COL_COUNTY = 12;
public final int COL_STATE = 13;
public final int COL_GNIS_ID = 14;
public final int COL_STREAM_MILE = 15;
public final int COL_WATER_SOURCE = 16;
// public final int COL_HUC = 13;  // Not in object
public final int COL_LONG = 17;
public final int COL_LAT = 18;
public final int COL_UTM_X = 19;
public final int COL_UTM_Y = 20;
public final int COL_WDID = 21;
public final int COL_INPUT_TYPE = 22;

/**
Input type for time series identifier (default to "HydroBase" but can be set to allow class to be used
with other State-related data, such as ColoradoWaterSMS).
*/
private String __inputType = "ColoradoHydroBaseRest";

/**
 * Datastore associated with the data being displayed.
 */
private ColoradoHydroBaseRestDataStore dataStore = null;

/**
Constructor.  This builds the model for displaying the given HydroBase time series data.
The input type defaults to "HydroBase".
@param dataStore datastore that can be used for additional queries, such as to form tooltips.
@param worksheet the JWorksheet that displays the data from the table model.
@param data the list of HydroBase_StationGeolocMeasType or HydroBase_StructureGeolocStructMeasType
that will be displayed in the table (null is allowed - see setData()).
@inputName input name for time series (default if not specified is "HydroBase").  Use this, for example,
when using the class to display data from the ColoradoWaterSMS database.
@throws Exception if an invalid results passed in.
*/
public ColoradoHydroBaseRest_WaterClass_TableModel ( ColoradoHydroBaseRestDataStore dataStore,
	JWorksheet worksheet, List<DiversionWaterClass> data )
throws Exception
{
    this ( dataStore, worksheet, data, null );
}

/**
Constructor.  This builds the model for displaying the given HydroBase time series data.
@param dataStore datastore that can be used for additional queries, such as to form tooltips.
@param worksheet the JWorksheet that displays the data from the table model.
@param data the list of HydroBase_StationGeolocMeasType or HydroBase_StructureGeolocStructMeasType
that will be displayed in the table (null is allowed - see setData()).
@inputType input type for time series (default if null or blank is "HydroBase").  Use this, for example,
when using the class to display data from the ColoradoWaterSMS database.
@throws Exception if an invalid results passed in.
*/
public ColoradoHydroBaseRest_WaterClass_TableModel ( ColoradoHydroBaseRestDataStore dataStore,
	JWorksheet worksheet, List<DiversionWaterClass> data, String inputType )
throws Exception
{	if ( data == null ) {
		_rows = 0;
	}
	else {
	    _rows = data.size();
	}
	_data = data;
	if ( (inputType != null) && !inputType.equals("") ) {
	    __inputType = inputType;
	}
	this.dataStore = dataStore;
}

/**
From AbstractTableModel.  Returns the class of the data stored in a given column.
@param columnIndex the column for which to return the data class.
*/
public Class<?> getColumnClass (int columnIndex) {
	switch (columnIndex) {
		// FIXME - can't seem to handle missing...
		//case COL_START:		return Integer.class;
		//case COL_END:			return Integer.class;
		//case COL_DIV:			return Integer.class;
		//case COL_DIST:		return Integer.class;
		default: return String.class;
	}
}

/**
From AbstractTableMode.  Returns the number of columns of data.
@return the number of columns of data.
*/
public int getColumnCount() {
	return __COLUMNS;
}

/**
From AbstractTableMode.  Returns the name of the column at the given position.
@return the name of the column at the given position.
*/
public String getColumnName(int columnIndex) {
	switch (columnIndex) {
		case COL_ID: return "ID";
		case COL_NAME: return "Name/Description";
		case COL_DATA_SOURCE: return "Data Source";
		case COL_DATA_TYPE: return "Data Type";
		case COL_TIME_STEP: return "Time Step";
		case COL_UNITS: return "Units";
		case COL_START: return "Start";
		case COL_END: return "End";
		//case COL_MEAS_COUNT: return "Meas. Count";
		case COL_DIV: return "Div.";
		case COL_DIST: return "Dist.";
		case COL_COUNTY: return "County";
		case COL_STATE: return "State";
		case COL_GNIS_ID: return "GNIS ID";
		case COL_STREAM_MILE: return "Stream Mile";
		case COL_WATER_SOURCE: return "Water Source";
		//case COL_HUC: return "HUC";
        case COL_LONG: return "Longtitude";
        case COL_LAT: return "Latitude";
		case COL_UTM_X: return "UTM X";
		case COL_UTM_Y: return "UTM Y";
		case COL_STR_TYPE: return "Structure Type";
		case COL_CIU: return "CIU";
		case COL_WDID: return "WDID";
		case COL_INPUT_TYPE: return "Data Store/Input Type";
		default: return "";
	}
}

/**
Returns an array containing the column widths (in number of characters).
@return an integer array containing the widths for each field.
*/
public String[] getColumnToolTips() {
    String[] tips = new String[__COLUMNS];
    tips[COL_ID] = "Waterclass identifier from primary data provider";
    tips[COL_NAME] = "Waterclass name";
    tips[COL_DATA_SOURCE] = "Organization/agency abbreviation";
    tips[COL_DATA_TYPE] = "Data type";
    tips[COL_TIME_STEP] = "Time step";
    tips[COL_UNITS] = "Data units";
    tips[COL_START] = "Starting date/time of available data";
    tips[COL_END] = "Ending date/time of available data";
    //tips[COL_MEAS_COUNT] = "Count of available measurements";
    tips[COL_DIV] = "Water division, determined from spatial location";
    tips[COL_DIST] = "Water district, determined from spatial location";
    tips[COL_COUNTY] = "County name, determined from spatial location";
    tips[COL_STATE] = "State abbreviation";
    tips[COL_GNIS_ID] = "GNIS ID for stream";
    tips[COL_STREAM_MILE] = "Stream mile";
    tips[COL_WATER_SOURCE] = "Water source name";
    //tips[COL_HUC] = "Hydrologic Unit Code";
    tips[COL_LONG] = "Longitude decimal degrees";
    tips[COL_LAT] = "Latitude decimal degrees";
    tips[COL_UTM_X] = "UTM X, meters";
    tips[COL_UTM_Y] = "UTM Y, meters";
    tips[COL_STR_TYPE] = "Structure type";
    tips[COL_CIU] = this.dataStore.getCurrentInUseToolTip();
    tips[COL_WDID] = "Water district identifier";
    tips[COL_INPUT_TYPE] = "Input type or data store name";
    return tips;
}

/**
Returns an array containing the column widths (in number of characters).
@return an integer array containing the widths for each field.
*/
public int[] getColumnWidths() {
    int[] widths = new int[__COLUMNS];
    widths[COL_ID] = 12;
    widths[COL_NAME] = 20;
    widths[COL_DATA_SOURCE] = 10;
    widths[COL_DATA_TYPE] = 30;
    widths[COL_TIME_STEP] = 8;
    widths[COL_UNITS] = 8;
    widths[COL_START] = 10;
    widths[COL_END] = 10;
    //widths[COL_MEAS_COUNT] = 8;
    widths[COL_DIV] = 5;
    widths[COL_DIST] = 5;
    widths[COL_COUNTY] = 8;
    widths[COL_STATE] = 3;
    widths[COL_GNIS_ID] = 8;
    widths[COL_STREAM_MILE] = 8;
    widths[COL_WATER_SOURCE] = 15;
    //widths[COL_HUC] = 8;
    widths[COL_LONG] = 8;
    widths[COL_LAT] = 8;
    widths[COL_UTM_X] = 8;
    widths[COL_UTM_Y] = 8;
    widths[COL_CIU] = 5;
    widths[COL_STR_TYPE] = 13;
    widths[COL_WDID] = 5;
    widths[COL_INPUT_TYPE] = 15;
    return widths;
}

/**
Returns the format to display the specified column.
@param column column for which to return the format.
@return the format (as used by StringUtil.formatString()).
*/
public String getFormat ( int column ) {
	switch (column) {
		default: return "%s"; // All are strings.
	}
}

/**
From AbstractTableMode.  Returns the number of rows of data in the table.
*/
public int getRowCount() {
	return _rows;
}

/**
Return a TSIdent object for the specified row, used to transfer the table to valid time series identifier.
@return the TSIdent object for the specified row.
@exception Exception if there is an error setting the interval in the TSIdent.
*/
public TSIdent getTimeSeriesIdentifier(int row) {
    TSIdent tsid = new TSIdent();
    String id = (String)getValueAt( row, COL_ID );
    tsid.setLocation(id);
    tsid.setSource((String)getValueAt( row, COL_DATA_SOURCE));
    tsid.setType((String)getValueAt( row, COL_DATA_TYPE));
    try {
    	tsid.setInterval((String)getValueAt ( row, COL_TIME_STEP));
    }
    catch ( Exception e ) {
    	// Recast exception so it does not require declaring in method signature
    	throw new RuntimeException(e);
    }
    // Scenario is blank
    // Sequence number is blank
    tsid.setInputType((String)getValueAt( row, COL_INPUT_TYPE));
    // No input name
    // Format a simple comment that includes the telemetry station name
    tsid.setComment(id + " - " + (String)getValueAt ( row, COL_NAME));
    return tsid;
}

/**
From AbstractTableModel.  Returns the data that should be placed in the JTable at the given row and column.
@param row the row for which to return data.
@param col the column for which to return data.
@return the data that should be placed in the JTable at the given row and column.
*/
public Object getValueAt(int row, int col)
{	
	
	// If sorted, get the position in the data from the displayed row.
	// TODO @jurentie 06/22/2018 ask steve if you can get rid of this
	if (_sortOrder != null) {
		row = _sortOrder[row];
	}
	
	DiversionWaterClass divWC = _data.get(row);

	DecimalFormat df = new DecimalFormat();
	df.setMaximumFractionDigits(6);
	df.setMinimumFractionDigits(6);
	
	// TODO @jurentie 06/22/2018 join structure with waterclass to finish populating table
	// Populate table with data values
	String divRecDataType = divWC.getDivrectype();
	String timeStep = divWC.getTimeStep();
	switch (col) {
		// case 0 handled above.
		case COL_ID: return divWC.getWdid();
		case COL_NAME: return divWC.getStructureName();
		case COL_DATA_SOURCE: return "DWR";
		case COL_DATA_TYPE:
			if(divRecDataType.equalsIgnoreCase("WATERCLASS")){
				String divWCIdentifier = divWC.getWcIdentifier();
				if(divWCIdentifier.indexOf('.') >= 0){
					// Have to wrap periods because they break normal TSID
					return TSIdent.PERIOD_QUOTE + divRecDataType + "-" + divWCIdentifier + TSIdent.PERIOD_QUOTE;
				}
				else {
					// No need for wrapping quotes
					return divRecDataType + "-" + divWCIdentifier;
				}
			}
			else {
				// "Simple" data types like "DivTotal"
				return divRecDataType;
			}
		case COL_TIME_STEP: return timeStep;
		case COL_UNITS:
			if ( divRecDataType.equalsIgnoreCase("DivTotal") || divRecDataType.equalsIgnoreCase("RelTotal") || divRecDataType.equalsIgnoreCase("WaterClass") ) {
				// Diversion records that all derive from daily CFS measurements, aggregated to month and year AF
				if ( timeStep.equalsIgnoreCase("Day")) {
					return "CFS";
				}
				else {
					return "AF";
				}
			}
			else {
				// TODO smalers 2018-06-30 fill this in as other data types are tested
				return "";
			}
		case COL_START: return divWC.getPorStart();
		case COL_END: return divWC.getPorEnd();
		//case COL_MEAS_COUNT: return
		case COL_DIV: return divWC.getDivision();
		case COL_DIST: return divWC.getWaterDistrict();
		case COL_COUNTY: return divWC.getCounty();
		case COL_STATE: return "CO";
		case COL_GNIS_ID: return divWC.getGnisId();
		case COL_STREAM_MILE: return divWC.getStreamMile();
		case COL_WATER_SOURCE: return divWC.getWaterSource();
		//case COL_HUC: return divWC.getHuc10();
		case COL_LONG:
			Double longitude = divWC.getLongdecdeg();
			if ( longitude == null ) {
				return null;
			}
			else {
				return df.format(longitude);
			}
		case COL_LAT:
			Double latitude = divWC.getLatdecdeg();
			if ( latitude == null ) {
				return null;
			}
			else {
				return df.format(latitude);
			}
		case COL_UTM_X: return divWC.getUtmX();
		case COL_UTM_Y: return divWC.getUtmY();
		case COL_CIU: return divWC.getCiuCode();
		case COL_STR_TYPE: return divWC.getStructureType();
		case COL_WDID: return divWC.getWdid();
		case COL_INPUT_TYPE: return __inputType;
		default: return "";
	}
}

/**
Set the input type (default is "HydroBase" but need to change when the table model is used for
multiple purposes.
*/
public void setInputType ( String inputType )
{
    __inputType = inputType;
}

/**
Sets the alternate time step to display, rather than the one read from the
database.
*/
public void setTimeStep(String timeStep) {
	//__timeStep = timeStep;
}

}