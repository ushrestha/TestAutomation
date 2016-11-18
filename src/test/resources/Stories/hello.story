Scenario: Login into google page
Given I open google page
When I search for term 'apple'
Then I should see link for 'apple'
