import {useState} from 'react';

function Badge(props){

    const [count, setCount] = useState(0)

    const incrementCount = () => {
        console.log('click event')
        let newCount = count + 1;
        // props.caption = "Some value"
        setCount(newCount);
    }

    return(
        <button type="button" class="btn btn-primary" onClick={incrementCount}>
            {props.caption} <span class="badge bg-secondary">{count}</span>
        </button>
    );
}

export default Badge;