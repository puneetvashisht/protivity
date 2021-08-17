
function Badge(props){

    return(
        <button type="button" class="btn btn-primary">
            {props.caption} <span class="badge bg-secondary">{props.count}</span>
        </button>
    );
}

export default Badge;