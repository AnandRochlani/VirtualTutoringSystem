/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 12-11-2008
 * 
 * XDoclet definition:
 * @struts.form name="facultyAchievementsForm"
 */
public class FacultyAchievementsForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** facultyId property */
	private int facultyId;
	private String facultyName;

	/** achievementDesc property */
	private String achievementDesc;

	/** achievementId property */
	private int achievementId;

	/** specialRemarks property */
	private String specialRemarks;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the facultyId.
	 * @return int
	 */
	public int getFacultyId() {
		return facultyId;
	}

	/** 
	 * Set the facultyId.
	 * @param facultyId The facultyId to set
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	/** 
	 * Returns the achievementDesc.
	 * @return String
	 */
	public String getAchievementDesc() {
		return achievementDesc;
	}

	/** 
	 * Set the achievementDesc.
	 * @param achievementDesc The achievementDesc to set
	 */
	public void setAchievementDesc(String achievementDesc) {
		this.achievementDesc = achievementDesc;
	}

	/** 
	 * Returns the achievementId.
	 * @return int
	 */
	public int getAchievementId() {
		return achievementId;
	}

	/** 
	 * Set the achievementId.
	 * @param achievementId The achievementId to set
	 */
	public void setAchievementId(int achievementId) {
		this.achievementId = achievementId;
	}

	/** 
	 * Returns the specialRemarks.
	 * @return String
	 */
	public String getSpecialRemarks() {
		return specialRemarks;
	}

	/** 
	 * Set the specialRemarks.
	 * @param specialRemarks The specialRemarks to set
	 */
	public void setSpecialRemarks(String specialRemarks) {
		this.specialRemarks = specialRemarks;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
}