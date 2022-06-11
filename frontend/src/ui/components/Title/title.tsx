import { TitleStyled, SubTitle } from "./title.style";

interface TitleProps {
    title: String;
    subtitle?: String | JSX.Element;

}
export default function Title(props: TitleProps) {
    return (
        <>
            <TitleStyled>{props.title}</TitleStyled>
            <SubTitle>{props.subtitle}</SubTitle>
        </>
    );
}