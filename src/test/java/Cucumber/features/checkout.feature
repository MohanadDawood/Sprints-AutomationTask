Feature: Checkout process

  Scenario: User adds product to cart and places an order
    Given the user is on the home page
    When the user searches for a product "arg"
    And the user adds the product to the cart
    And the user fills in the shipping address with email "mohaneddawood990@gmail.com"
    And the user proceeds to checkout
    Then the user should be able to place an order successfully