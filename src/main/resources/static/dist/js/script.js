const search=()=>{
    //console.log("searching......");

    let query = $("#search-input").val();

        console.log(query);


        if(query=="")
        {

        }
        else {
            let url =  `http://localhost:8080/search/${query}`;
            console.log(url);
            fetch(url).then(response=>{
                return response.json();
            }).then(data=>{
                console.log(data);
            })
        }


}