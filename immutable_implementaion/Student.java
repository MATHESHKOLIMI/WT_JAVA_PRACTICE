package com.practice.Immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final public class Student {
	final private String studentId;
	final private String studentName;
	final private Address address;
	final private Map<String, Subject> marksList;

	public Student(String studentId, String studentName, Address address, Map<String, Subject> marksList)
			throws CloneNotSupportedException {
		super();
		this.studentId = studentId;

		this.studentName = studentName;

		/*
		 * Address addressCopy = new Address();
		 * addressCopy.setDoorNumber(address.getDoorNumber());
		 * addressCopy.setStreetName(address.getStreetName());
		 * addressCopy.setState(address.getState());
		 * addressCopy.setPinCode(address.getPinCode());
		 */
		Address addressCopy = (Address) address.clone();
		this.address = addressCopy;

		Map<String, Subject> mapCopy = new HashMap<>();
		for (Entry<String, Subject> entry : marksList.entrySet()) {
			/*
			 * Subject subjectCopy= new Subject(); Subject original=
			 * marksList.get(entry.getKey());
			 * subjectCopy.setSubjectId(original.getSubjectId());
			 * subjectCopy.setSubjectName(original.getSubjectName());
			 * subjectCopy.setSubjectCode(original.getSubjectCode());
			 * subjectCopy.setGrade(original.getGrade());
			 */
			Subject original = marksList.get(entry.getKey());
			Subject subjectCopy = (Subject) original.clone();
			mapCopy.put(entry.getKey(), subjectCopy);
		}
		this.marksList = mapCopy;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Address getAddress() throws CloneNotSupportedException {
		/*
		 * Address addressCopy = new Address();
		 * addressCopy.setDoorNumber(address.getDoorNumber());
		 * addressCopy.setStreetName(address.getStreetName());
		 * addressCopy.setState(address.getState());
		 * addressCopy.setPinCode(address.getPinCode());
		 */
		Address addressCopy = (Address) address.clone();
		return addressCopy;
	}

	public Map<String, Subject> getMarksList() throws CloneNotSupportedException {
		Map<String, Subject> mapCopy = new HashMap<>();
		for (Entry<String, Subject> entry : marksList.entrySet()) {
			/*
			 * Subject subjectCopy= new Subject(); Subject original=
			 * marksList.get(entry.getKey());
			 * subjectCopy.setSubjectId(original.getSubjectId());
			 * subjectCopy.setSubjectName(original.getSubjectName());
			 * subjectCopy.setSubjectCode(original.getSubjectCode());
			 * subjectCopy.setGrade(original.getGrade())
			 */;
			Subject original = marksList.get(entry.getKey());
			Subject subjectCopy = (Subject) original.clone();
			mapCopy.put(entry.getKey(), subjectCopy);
		}
		return mapCopy;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", marksList=" + marksList + "]";
	}

}
