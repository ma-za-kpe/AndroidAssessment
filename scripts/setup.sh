#!/bin/bash

# INSTRUCTIONS:
# This script will move the pre-push hook from script folder to
# the .git/hooks folder
#
# Run the script from the androidassessment-android root folder:
#
#   bash scripts/setup.sh
#
# NOTE: this script should be run once after the initial codebase setup

# Move file from script folder to .git/hooks folder
cp scripts/pre-push.sh .git/hooks/pre-push

# Create a folder where all the set up files will be downloaded
mkdir -p ../androidassessment-tools
cd ../androidassessment-tools

# Download ktlint
bash ../AndroidAssessment/scripts/ktlint_download.sh

# Download checkstyle
bash ../AndroidAssessment/scripts/checkstyle_download.sh