#Feature: Search for product
#  As a: User
#  I want: to search specific product
#  So that: I can select from results
#
#  Scenario Outline: Validate searching the product
#    Given The user opens home page
#    When The user searches for '<ProductName>'
#    Then The user is redirected to page with results for search
#
#    Examples:
#      | ProductName |
#      | shoes       |