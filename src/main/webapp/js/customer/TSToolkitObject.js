var fullUrl = location.href;
var u = fullUrl .slice(fullUrl .lastIndexOf ("/")+1,fullUrl .indexOf("?") > 0 ? fullUrl .indexOf("?") : fullUrl.length);
if(u != "index.do"){
	document.write ("<OBJECT id=\"TSToolkit\"");
	document.write ("classid=\"CLSID:55D9860A-AB9C-44A1-BB74-75AF7F805333\"");
	document.write ("codebase=\"/js/download/TSToolkit.cab#version=2,0,6,4\" ");
	document.write ("style=\"LEFT: 0px; TOP: 0px\" width=\"0\" height=\"0\" VIEWASTEXT>");
	document.write ("</OBJECT>");
}