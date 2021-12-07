package com.emp;

public class EmployeeWageUC4 {

	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	static final int SALARY_PER_HOUR = 20;

	public static void main(String[] args) {
		usingSwitchCases();
	}

	private static void usingSwitchCases() {
		int empCheck;
		empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		int empHr = 0;

		switch (empCheck) {
		case IS_PRESENT:
			empHr = 8;
			break;

		case IS_PART_TIME:
			empHr = 4;
			break;

		default:
			empHr = 0;
			break;
		}

		double empSalary = empHr * SALARY_PER_HOUR;
		System.out.println("Emp Wage : " + empSalary);
	}
}
