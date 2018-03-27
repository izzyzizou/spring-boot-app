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
                <h2>Spring Boot & React App</h2>
                <div className="displayApp">
                    {data.map((data) => 
                        <div className="box" key={data.id}>
                            <p>{`${data.firstName} ${data.lastName}`}</p>
                            <img alt="text" src={data.imageUrl}/>
                            <p>{data.age}</p>
                            <p>{data.mobileNumber}</p>
                            <div className="address">
                                <h2>Primary Address: </h2>
                                <div className="data">
                                    <p>{`${data.address.primaryAddress.street},
                                    ${data.address.primaryAddress.city},
                                    ${data.address.primaryAddress.state}`}</p>
                                </div>
                                <h2>Secondary Address: </h2>
                                <div className="data">
                                    <p>{`${data.address.secondaryAddress.street},
                                    ${data.address.secondaryAddress.city},
                                    ${data.address.secondaryAddress.state}`}</p>
                                </div>
                                <h2>Office Address:</h2>
                                <div className="data">
                                    <p>{`${data.address.officeAddress.street},
                                    ${data.address.officeAddress.city},
                                    ${data.address.officeAddress.state}`}</p>
                                </div>
                            </div>
                        </div>
                    )}
                </div>
            </div>
        );
    }
}

export default Data;