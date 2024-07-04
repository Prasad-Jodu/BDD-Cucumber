Feature: TagsDemo
Scenario: Scenario_1
Given Execute Scenario_One

@Smoke
Scenario: Scenario_2
Given Execute Scenario_Two

Scenario: Scenario_3
Given Execute Scenario_Three
@Smoke @Regression
Scenario: Scenario_4
Given Execute Scenario_Four

@Regression
Scenario: Scenario_5
Given Execute Scenario_Five