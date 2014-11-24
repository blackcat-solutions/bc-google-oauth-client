bc-google-oauth-client
======================

Version of google oauth client with minor modifications to handle long-running oauth sessions as implemented by xero.com

How to update the deployed version
==================================

  1. Checkout the BlackCat open source maven repo as a sibling to this checkout - https://github.com/blackcat-solutions/releases
  1. Make your changes in this repo
  1. Issue the command `mvn clean deploy` to put your updated version in to the checked out version of the `releases` directory
  1. Commit the changes in the `releases` checkout and push them

