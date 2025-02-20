function getdata(dataId){
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
            console.log("Data is",dataId)
           resolve("success");
        //    reject("error")
            
        },2000)
    })
}

// let p1=getdata(1)

 async function getalldata(){
    await getdata(1)
    await getdata(2)
    await getdata(3)
    await getdata(4)

}

getalldata()

// p1.then((value)=>{
//     console.log(value)
//     getdata(2).then(()=>{
//         getdata(3).then(()=>{
//             getdata(4)
//         })
//     })
// })

// p1.catch((err)=>{
//     console.log("it is rejected",err)

// })
    
    


// getdata(1,()=>{
//     getdata(2,()=>{
//         getdata(3)
//     })
// })
