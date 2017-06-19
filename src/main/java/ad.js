/**
 * Created by forever on 2017-6-19.
 */

var a=(function(){
    var count= 0;
    return function (){
        return ++count ;

    }
})();

console.log(a());
console.log(a());




function sd(){
    var count =0;
    return function ds (){
        return count ++;
    }
}