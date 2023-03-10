#!/bin/bash

# This script will run the pre-push checks in the given order
# - ktlint
# - checkstyle
# - (others in the future)

if bash scripts/ktlint_lint_check.sh && bash scripts/checkstyle_lint_check.sh ; then
  echo "All checks passed successfully"
  exit 0
else
  exit 1
fi

# TODO(#970): Add Jetpack compose Linter to the project