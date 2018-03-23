import * as React from 'react';
import './Data.css';

class Data extends React.Component{
    constructor(){
        super();

        this.state = {
            data: [],
            isLoading: false
        };
    }

    componentDidMount(){
        this.setState({isLoading: true});

        fetch('http://localhost:8080/user/details')
        .then(res => res.json())
        .then(data => this.setState({data: data, isLoading: false}));
    }
    render(){
        const {data, isLoading} = this.state;

        if(isLoading){
            return <p>Loading...</p>
        }

        return(
            <div>
                <h2>Image List</h2>
                <div className="displayApp">
                    {data.map((data) => 
                        <div key={data.id}>
                            <p>{`${data.firstName} ${data.lastName}`}</p>
                            <img alt="text" src={data.imageUrl}/>
                            <p>{data.age}</p>
                            <p>{data.mobileNumber}</p>
                        </div>
                    )}
                </div>
            </div>
        );
    }
}

export default Data;