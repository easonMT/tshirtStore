# T-Shirt Storefront CLI Application

## Description

A feature-rich command-line interface (CLI) application simulating a T-Shirt storefront. Developed in Java, this application provides users the ability to explore products, make purchases, and manage their shopping cart.

## Features

* List available T-Shirts with detailed descriptions, including ID, name, and price.
* An interactive menu system guiding users through various operations.
* Purchase T-Shirts using their unique ID.
* Search functionality to find T-Shirts by name.
* A shopping cart system allowing users to view their selected items, see pre and post-tax totals, and checkout.
* Warm greeting upon entry, personalizing the shopping experience.

## Classes & Their Responsibilities

* ShopRunner: The main entry point for initializing the shop and starting the user interaction.
* Shop: Manages the storefront by listing products, allowing product search, and managing product inventory.
* Menu: Central hub for user interactions, providing a range of options to guide user actions and processing their responses.
* Product: Represents individual T-Shirt products, encapsulating attributes like ID, name, and price.
* Cart: Manages the user's shopping cart, adding products, displaying cart details, calculating totals, and facilitating the checkout process.
