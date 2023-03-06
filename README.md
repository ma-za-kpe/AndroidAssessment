﻿# AndroidAssessment

## Installation

Please follow these steps to set up AndroidAssessment on your local machine.
1. Create a new, empty folder called androidassessment/ within your home folder. 
2. Navigate to it (cd androidassessment), then clone the AndroidAssessment repo. 
3. This will create a new folder named androidassessment/AndroidAssessment.

- Note: Please keep the folder name as androidassessment.
- Changing the project folder name might lead to future issues with running the pre-push checks on your machine.

2. Run the setup script, which adds some development tools for AndroidAssessment (ktlint, checkstyle, etc.):
-  For Windows
    - Install Git Bash Command Line
    - Open Git Bash Command Line.
    - Navigate to androidassessment/AndroidAssessment.
    - Run the script ``` bash scripts/setup.sh ```.
    - Download the google_checks.xml(https://github.com/checkstyle/checkstyle/blob/14005e371803bd52dff429904b354dc3e72638c0/src/main/resources/google_checks.xml) file. To do this, you can simply right-click on the Raw button and click on Save Link as.
    - Copy this file to the directory where Git is installed (usually C:/Program Files/Git/).

3. Follow instruction on this https://stackoverflow.com/a/66133030/8277525 to change IntelliJ's import order for Kotlin to satisfy ktlint

4. In Android Studio, select File > Open, navigate to androidassessment/AndroidAssessment, and click OK to load the project.

5. Click the elephant icon in the toolbar ("Sync Gradle") to ensure that all the correct dependencies are downloaded. (In general, you'll want to do this step any time you update your dependencies.)

## Important Design Links
1. Postman
   - Farmers => [https://documenter.getpostman.com/view/3729762/2s93JowRBY](Sample Api For Farmer)
   - Capacity =>[https://documenter.getpostman.com/view/3729762/2s93JowR7C](Sample Api For Capacity)
   
## Important Design images
![farmer-credit-system drawio](https://user-images.githubusercontent.com/28810111/223129269-7239d139-64f0-4862-bd1e-7d5a6516848f.svg)
![farmer-credit-system-flow-chart drawio](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=farmer-credit-system-flow-chart.drawio#R7Vvbdto4FP0a1pp5SJZt2VweA7m0M2nTrqTN5FHYilEjLGqLAP36kUC%2BScYGAoYQXhIkZFk6e%2B%2BjcyTRAL3h9CaEo8EX6iHSsAxv2gCXDcsyW47B%2F4mamazptNuLGj%2FEnqxLK%2B7xHyQr5YP%2BGHsoyjVklBKGR%2FlKlwYBclmuDoYhneSbPVOSf%2BsI%2BkiruHch0WsfsccGi9q21UrrPyHsD%2BI3m83O4pshjBvLmUQD6NFJpgpcNUAvpJQtPg2nPUSE9WK7PH6ePZLbl%2BbNP9%2Bj3%2FBH99%2BHrz%2FPFp1dr%2FNIMoUQBWy7XVuLrl8hGUt7ybmyWWzAkI4DD4lOjAboDtiQ8I8m%2F%2FgLMTaTgMMxo7yKhmxAfRpAckvpSLZ7pgGTzUxRRoF3IYDl5T6h7sui6hoTIt%2FBS7J9m5ciFtKXBDvRQQKEaExgH5EudF%2F8%2BUB7lNCQfxXQAImuPE4GOZd0cFdpLX8ZC2f%2Fic7Onbj4lAyEFy6nudIsLk0xyzzGS09yeOJz%2BpAoxM%2BsiKPEO6Lj0EUl7YCUEwx9VNafpLqwRUYTkiU3iA4RnxhvECICGX7NCwdK%2FflJu%2BTRbxTzeViGdBaJUGJXYRj5LhYDlU%2BlTOUfMsNIq%2Bb8XYPLQOPy3QgFvOZiNCphtYBsMsAM3Y%2Fg3NwT7gnzTM8ymM%2B%2B6xMYRRLTCnquB%2FkrChmaloIUf9vMG%2FsssfYk9XJmjMgg4%2BFsYzmwOUjWtX9Tsz%2BObqnvI%2B9z8NffDXCtgzCgw%2F44qgYgZ1KBxjUcYiKm%2FgmRV8SwCwtgggT7AS%2B43PYoLMaKvxIHPi8109LD3HWd2TuED3Ty8HUKwDMKwGvvCryWBl6EOCCc6IPPAWZCQkUAHpmKwL41ZOoLMuVOrAcFM9nsmoZDLqVjgwEAFYYacfDuZo%2BXv2bdh7ub0eQFsB%2B%2FnwMZSmVh8OkD%2FQJxcITmN1t58yex%2B97MfwpLDyC8rCtsNDt8jkWLYdzHYqRa3FgZgCY83n4AWshas10QAV2M2YDjwSMUxtmqslgY91ZQJc9hLXIRYuZdkAv5xRB73pwnIYrwH9if9yc4MBKTm0%2FX6Tacy0JWlEpO9RpJZi5f0sgmv0Xe5Mw4NztWJ4dEzLlNqTIrfIA%2BP0doJ0jaGpBPKCoEr1zF79tJxZmxmcuL0zT5cDNjmYpkM%2BOyZb7SxSUZ7dtovJy4mi8DSmRqqcn0qk7Rdio62rVT1EMpHH2l7GIcVDnGj6AtYzNtmRllpTqrMyyo3HVqHqy2tI0qsKG2QNPMd2QloUyFujjR4CzTTC7bS4Mk0M4P2THKB9YunmGq7cUAtqv0OPHIKv0u6FMYznV62v%2FJBEmKV05SsDo2gIrR02Oek59%2Bewx0UH66VLaVjjqN7w1gASW%2Bt9%2FmveNgRelVIfsKvj0RTd5Rru%2FaW4prB7ty7UtGvOoEWxUrwVtam53y5qoT69Sxyug71R85N9swfqwnNyv1N%2B84ObMVR2Wqq%2FLKXkYRs7ajuuPkLN5XLdtozdDaFXvV2M3LJa%2Bj9chSiW0mHHIKoiHnjZgvSQhAjO%2FaeKoHGWpHu8ZTPwOXx0eYQfJRTo%2BaBbF0vccXeix9kpXISrclK7WjXcvKKZbVAIbQ5anlBxGW3d67sPQ7JidhcXt3tORkU2kVdLVrcekB%2FVxclHAbofDDLFu2tXd16eeXJ3Vxe4MtLVtaRztWFtDDEBcSdyx01QuRh9m9S0N0hNpy2vkbBY7t6NoCdWoL6CEEjn5Cgj0ORsNqwqGw6uLv%2Fbg%2FxIyd9sxVUJUosGjP3C4AVb1Psj1Qtx6ObLqvs57NK7deYrYeiEdWz7DBpvstjnrfs1V3tAP0aGdPlKn3KLk09Ht3fFRptOmNNaejxoA1s3HrEd8BXFCI71AfHVnaSxKGusjSOWzXZdXru5zj8F32piek%2B%2FZdtn7dpIyO8uBsBS6e2wBk%2BWieG01QxUhR%2BoZCzGclwuZdBGWrnoftJ0t2Nr2gqB46J2F9XTyydrUGrnPIuunPULfs1cDKXs0%2BKDba6iWK5oZsVFMNZ2u%2FIeDF9Lfii%2BbpT%2B7B1f8%3D)
