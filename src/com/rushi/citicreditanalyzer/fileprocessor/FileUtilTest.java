package com.rushi.citicreditanalyzer.fileprocessor;

import com.rushi.citicreditanalyzer.fileprocessor.FileUtil;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FileUtilTest extends TestCase {

	private FileUtil fileUtil;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setFileUtil(new FileUtil());
	}

	public void testisPDFWithoutExtensionFalse() {

		fileUtil = getFileUtil();
		Assert.assertFalse(fileUtil.isPDFFile("test"));

	}
	
	public void testgetExtensionWithoutExtensionNull() {

		fileUtil = getFileUtil();
		Assert.assertNull(fileUtil.getExtension("test"));

	}

	public void testgetExtensionWithExtensionNotNullWithoutPDF() {

		fileUtil = getFileUtil();
		Assert.assertNotNull(fileUtil.getExtension("test.xml"));
		Assert.assertEquals("xml", fileUtil.getExtension("test.xml"));

	}
	
	public void testgetExtensionWithExtensionNotNullWithPDF() {

		fileUtil = getFileUtil();
		Assert.assertNotNull(fileUtil.getExtension("test.pdf"));
		Assert.assertEquals("pdf", fileUtil.getExtension("test.pdf"));

	}

	public void testisPDFWithoutPDFFalse() {

		fileUtil = getFileUtil();
		Assert.assertFalse(fileUtil.isPDFFile("test.text"));

	}

	public void testisPDFWithPDFTrue() {

		fileUtil = getFileUtil();
		Assert.assertTrue(fileUtil.isPDFFile("test.pdf"));

	}

	public FileUtil getFileUtil() {
		return fileUtil;
	}

	public void setFileUtil(FileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}
}
