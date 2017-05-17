function _format_serialize(param){
  var temp = '{"' + param.replace(new RegExp("\&","g"),'","').replace(new RegExp("\=","g"),'":"') + '"}';
  console.log(temp);
  return JSON.parse(temp);
  // return temp;
}
