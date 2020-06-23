
Electricity Usage Report

IPO

INPUT

Header record
Detail record
Customer number
Customer name
Electricity usage inKW hours

OUTPUT

Electricity usage report
Customer number
Customer name
Electricity usage
Amount owing
Total electricity usage in kwHours


PROCESS
BEGIN

GETTING INPUT

    get totalElectricityUsage from headerfile

    prompt user for customer number
    get customerNumber

    prompt user for customerName
    get customerName

    prompt user for electricity usage
    get customerElectricityUsage

CALCULATE

    if customerElectricityUsage > 200 {
        amountOwing = (200*11) + ((customerElectricityUsage - 200)*8)
    } else {
        amountOwing = (customerElectricityUsage*11)
    }

    amountOwing = (amountOwing/100) //convert cents to dollars
    amountOwing = $

OUTPUT

    display customerNumber
    display customerName
    display electricityUsage
    display amountOwing
    display totalElectricityUsage



END