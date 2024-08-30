Feature: Checking smoke regression endtoend testing
Scenario: Tags demo with different testing

  @smoke
  Scenario: Add Product ot bag
    Given
    When
    And


  @smoke
  Scenario: Increase product Quantity from bag
    Given
    When
    And


  @smoke
  Scenario: Add Product ot bag
    Given
    When
    And


  @smoke @End2End
  Scenario: Buy a product with Cash payment
    Given
    When
    And


  @smoke @End2End
  Scenario: Buy a product with Cash and Cary payment
    Given
    When
    And

  @regression
  Scenario: Unsucessful Login
    Given
    When
    And


  @smoke @regression
  Scenario: Sucessfull Login
    Given
    When
    And




  @smoke @regression
  Scenario: Remove product from bag
    Given
    When
    And




  @End2End
  Scenario: CC DD Card BankPayment Cash Paypal
    Given
    When
    And




  @regression
  Scenario: Remove all product from bag
    Given
    When
    And




