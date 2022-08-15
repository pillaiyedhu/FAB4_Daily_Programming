'use strict';


function leapYear(lyear){
    if (lyear >= 1000 && lyear <= 9999) {
        if ((lyear % 100 != 0 && lyear % 4 == 0) || (lyear % 400 == 0)) {
            console.log(`Its a Leap year`);
        }
        else{
            console.log(`It's not a leap year`);
        }
    }
    else{
        console.log(`Invalid Input`)
    }
}

leapYear(2020)          // Its a Leap year
leapYear(27023)         // Invalid Input
leapYear(1995)          // It's not a leap year

