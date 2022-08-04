Feature: Online Calculator

  Scenario Outline: Mathematical computation of numbers
    Given an online calculator is launched
    And "<operationName>" two numbers
    And first number "<firstValue>" is punched on the calculator
    And Operation "<Operation>" is applied
    And Second number "<secondValue>" is punched on the calculator
    When operation = is applied
    Then answer should be "<Answer>"
  Examples:
  |firstValue|secondValue|Operation|operationName |Answer|
  |1				 |	2				 |	×      | multiply		  | 2    |
  |9			   |	2				 |	+      | add    		  | 11   |
  |9			   |	3				 |	/      | divide 		  | 3    |
 
