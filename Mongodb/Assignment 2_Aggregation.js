QUESTIONS
1. use db.zipcodes.find() to filter results to only the results where city is ATLANTA
and state is GA.
2. use db.zipcodes.aggregate with $match to do the same as above.
3. use $group to count the number of zip codes in Atlanta.
4. use $group to find the total population in Atlanta.
5. use aggregate to calculate the total population for each state
6. sort the results by population, highest first
7. limit the results to just the first 3 results. What are the top 3 states in
population?
8. use aggregate to calculate the total population for each city (you have to use
city/state combination). You can use a combination for the _id of the $group: {
city: '$city', state: '$state' }
9. sort the results by population, highest first
10. limit the results to just the first 3 results. What are the top 3 cities in
population?
11. What are the top 3 cities in population in Texas?
12. Write a query to get the average city population for each state.
13. What are the top 3 states in terms of average city population?
ANSWERS
1.db.zipcodes.find({city:"ATLANTA", state: "GA"})
2.db.zipcodes.aggregate([{$match: {city:"ATLANTA", state: "GA"}}])
3.db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city", count:{$sum: 1}}}])
4.db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city", count:{$sum:"$pop"}}}])

5.db.zipcodes.aggregate([{$group:{_id:"$state", TotPopulation:{$sum:"$pop"}}}])
6.db.zipcodes.aggregate([{$group:{_id:"$state", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}])
7.db.zipcodes.aggregate([{$group:{_id:"$state", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}, {$limit: 3}])

8.db.zipcodes.aggregate([{$group:{_id:"$city", TotPopulation:{$sum:"$pop"}}}])
9.db.zipcodes.aggregate([{$group:{_id:"$city", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}])
10.db.zipcodes.aggregate([{$group:{_id:"$city", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}, {$limit: 3}])
11.db.zipcodes.aggregate([{$match:{state:"TX"}},{$group:{_id:"$city", TotPopulation:{$sum:"$pop"}}}, {$sort:{TotPopulation:-1}}, {$limit: 3}])
    1)Houston  2)Dallas  3)San Antonio

12.db.zipcodes.aggregate([{$group:{_id:"$state", AvgPopulation:{$avg:"$pop"}}}])
13.db.zipcodes.aggregate([{$group:{_id:"$state", AvgPopulation:{$avg:"$pop"}}}, {$sort:{AvgPopulation:-1}}, {$limit: 3}])
    1)DC   2)CA   3)FL
14.