// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum DocumentType
{
	XLS(new java.lang.String[][] { new java.lang.String[] { "en_US", "Excel 97 - 2003" } }),
	XLSX(new java.lang.String[][] { new java.lang.String[] { "en_US", "Excel 2007 and higher" } }),
	CSV(new java.lang.String[][] { new java.lang.String[] { "en_US", "CSV file" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DocumentType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
