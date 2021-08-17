

function Clock(){

    let now = new Date();
    return (
        <h2>Time right now - <span>{now.getHours()} : {now.getMinutes()} : {now.getSeconds()}</span></h2>
    )
}

export default Clock;